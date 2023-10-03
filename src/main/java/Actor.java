public abstract class Actor implements ActorBehaviour{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public boolean isMakeOrder() {
//        return isMakeOrder;
//    }

    public void setMakeOrder() {
        this.isMakeOrder= true;
    }

//    @Override
//    public boolean isTakeOrder() {
//        return isTakeOrder;
//    }

    public void setTakeOrder() {
        this.isTakeOrder = true;
    }
}
