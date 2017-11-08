package br.com.adensar.adensar_mobile.model;

/**
 * Created by willian on 02/11/2017.
 */

public class Fuste {

    private int nDelta;

    private double dap;

    private float cap;

    public Fuste() {
        this.nDelta = 0;
        this.dap = 0;
        this.cap = 0f;
    }

    private void calcDAP(float cap) {
        dap = cap/Math.PI;
    }

    public int getnDelta() {
        return nDelta;
    }

    public void setnDelta(int nDelta) {
        this.nDelta = nDelta;
    }


    public double getDap() {
        return dap;
    }

    public float getCap() {
        return cap;
    }

    public void setCap(float cap) {
        calcDAP(cap);
        this.cap = cap;
    }
}

