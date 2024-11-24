package src.ketaloca.models;

import java.util.ArrayList;

public class Alojamiento {
    private String id, userEmail, nombre, descripcion;
    private ArrayList<String> imgURL;
    private boolean animales;
    private Ubicacion ubicacion;

    public Alojamiento(String id, String userEmail, String descripcion, String nombre, ArrayList<String> imgURL, boolean animales, Ubicacion ubicacion) {
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

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
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