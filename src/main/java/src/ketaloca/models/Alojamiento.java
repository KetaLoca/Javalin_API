package src.ketaloca.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.Map;

public class Alojamiento {
    @NotNull
    private String id;
    @NotNull
    private String userEmail;
    @NotNull
    private String nombre;
    @NotNull
    private String descripcion;
    @NotNull
    private ArrayList<String> imgURL;
    @NotNull
    private boolean animales;
    @NotNull
    private Map<String, Double> ubicacion;

    @JsonCreator
    public Alojamiento(@JsonProperty("id") String id,
                       @JsonProperty("userEmail") String userEmail,
                       @JsonProperty("descripcion") String descripcion,
                       @JsonProperty("nombre") String nombre,
                       @JsonProperty("imgURL") ArrayList<String> imgURL,
                       @JsonProperty("animales") boolean animales,
                       @JsonProperty("ubicacion") Map<String, Double> ubicacion) {
        this.id = id;
        this.userEmail = userEmail;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.imgURL = imgURL;
        this.animales = animales;
        this.ubicacion = ubicacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<String> getImgURL() {
        return imgURL;
    }

    public void setImgURL(ArrayList<String> imgURL) {
        this.imgURL = imgURL;
    }

    public boolean isAnimales() {
        return animales;
    }

    public void setAnimales(boolean animales) {
        this.animales = animales;
    }

    public Map<String, Double> getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Map<String, Double> ubicacion) {
        this.ubicacion = ubicacion;
    }

    public static class Ubicacion {
        private double lat, lng;

        public Ubicacion(double lat, double lng) {
            this.lat = lat;
            this.lng = lng;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
        }
    }
}