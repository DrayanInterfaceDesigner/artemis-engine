package artemis;

import artemis.primitives.Vertex;

import java.util.ArrayList;

public abstract class Geometry {
    private Vertex position;
    private Vector3 size;
    private ArrayList<Vertex> matrix;
    private ArrayList<Vertex> rotation_matrix;
    public Geometry(Vertex position, Vector3 size) {
        this.position = position;
        this.size = size;
//        this.matrix = new ArrayList<Vertex>(3);

    }



}
