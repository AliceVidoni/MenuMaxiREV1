package web;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import entities.Menu;
import entities.OrdineStaff;
import managers.MenuSingleton;
import web.config.MMApi;

public class ServerRequests {

    private Context context;

    public ServerRequests(Context context) {
        this.context = context;
    }

    public void downloadMenu() {
        RequestQueue requestQueue = Volley.newRequestQueue(context);

        JsonObjectRequest request = new JsonObjectRequest(
                Request.Method.GET,
                MMApi.URL_MENU,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        MenuSingleton menuSingleton = MenuSingleton.getInstance();
                        Gson gson = new Gson();
                        menuSingleton.setMenu(gson.fromJson(response.toString(), Menu.class));
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Response", error.toString());
                    }
                }
        );

        requestQueue.add(request);
    }

    public void inviaConfermaOrdine(OrdineStaff ordine) {
        RequestQueue requestQueue = Volley.newRequestQueue(context);

        Gson gson = new Gson();

        JSONObject ordineJSON = null;
        try {
            ordineJSON = new JSONObject(gson.toJson(ordine));
        } catch (JSONException e) {
            Log.e("JSON error", e.toString());
        }

        JsonObjectRequest request = new JsonObjectRequest(
                Request.Method.POST,
                MMApi.URL_CONFERMA_ORDINE,
                ordineJSON,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Response", error.toString());
                    }
                }
        );

        requestQueue.add(request);
    }

    public void inviaRichiestaConto(String metodo) {
        RequestQueue requestQueue = Volley.newRequestQueue(context);

        JsonObjectRequest request = new JsonObjectRequest(
                Request.Method.GET,
                MMApi.URL_CONFERMA_ORDINE+metodo,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Response", error.toString());
                    }
                }
        );

        requestQueue.add(request);
    }
}
