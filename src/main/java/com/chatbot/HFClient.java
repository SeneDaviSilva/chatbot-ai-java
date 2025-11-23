package com.chatbot;

import okhttp3.*;
import com.google.gson.*;

public class HFClient {

    private final OkHttpClient client = new OkHttpClient();
    private final String apiKey;
    private final String model = "google/gemma-2-2b-it";

    public HFClient(String apiKey) {
        this.apiKey = apiKey;
    }

    public String sendMessage(String userMsg) throws Exception {

        JsonObject msg = new JsonObject();
        msg.addProperty("role", "user");
        msg.addProperty("content", userMsg);

        JsonArray messages = new JsonArray();
        messages.add(msg);

        JsonObject payload = new JsonObject();
        payload.add("messages", messages);
        payload.addProperty("model", model);
        payload.addProperty("max_tokens", 200);

        RequestBody body = RequestBody.create(
                payload.toString(),
                MediaType.parse("application/json")
        );

        Request request = new Request.Builder()
                .url("https://router.huggingface.co/v1/chat/completions")
                .addHeader("Authorization", "Bearer " + apiKey)
                .post(body)
                .build();

        Response response = client.newCall(request).execute();
        String json = response.body().string();

        try {
            JsonObject root = JsonParser.parseString(json).getAsJsonObject();
            JsonArray choices = root.getAsJsonArray("choices");
            JsonObject message = choices
                    .get(0).getAsJsonObject()
                    .getAsJsonObject("message");

            return message.get("content").getAsString();

        } catch (Exception e) {
            return "⚠️ Erro ao interpretar resposta da IA.\nResposta bruta:\n" + json;
        }
    }
}
