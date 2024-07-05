class PrimaryStudent extends Student{
    private String parentName;

    public PrimaryStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }
    public String toString(){
        return parentName+"'s daugther "+super.toString();
    }
}
