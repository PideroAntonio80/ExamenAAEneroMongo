package com.sanvalero.examen_aa_enero_mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.sanvalero.examen_aa_enero_mongo.domain.Equipo;
import com.sanvalero.examen_aa_enero_mongo.domain.Partido;
import org.bson.Document;

/**
 * Creado por @ author: Pedro Orós
 * el 27/01/2021
 */

public class EquipoDAO {

    private MongoClient mongoClient;
    private MongoDatabase db;
    private static final String DATABASE_NAME = "liga_futbol";
    private static final String COLLECTION_EQUIPO = "equipos";
    private static final String COLLECTION_PARTIDO = "partidos";

    public void conectar() {
        mongoClient = new MongoClient();
        db = mongoClient.getDatabase(DATABASE_NAME);
    }

    public void desconectar() {
        mongoClient.close();
    }

    public void guardar(Equipo equipo) {
        Document document = new Document()
                .append("nombre", equipo.getNombre());
        db.getCollection(COLLECTION_EQUIPO).insertOne(document);

    }

    public void eliminar(Equipo equipo) {
        db.getCollection(COLLECTION_EQUIPO).deleteOne(new Document("nombre", equipo.getNombre()));
    }

    public void guardarPartido(Partido partido) {
        Document document = new Document()
                .append("nombre", partido.getNombre());
        db.getCollection(COLLECTION_PARTIDO).insertOne(document);

    }

    public void eliminarPartido(Partido partido) {
        db.getCollection(COLLECTION_PARTIDO).deleteOne(new Document("nombre", partido.getNombre()));
    }

}
