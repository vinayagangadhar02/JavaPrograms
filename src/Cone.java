class Cone{
    private float radius;
    private float height;
    Cone(){
        this.height=10;
        this.radius=12;
    }
    Cone(float radius,float height){
        this.height=height;
        this.radius=radius;
    }

    public float getRadius() {
        return radius;
    }

    public float getHeight() {
        return height;
    }
}
