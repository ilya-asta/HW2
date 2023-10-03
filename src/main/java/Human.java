public class Human extends Actor{
    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
    }
    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
    }

    @Override
    public String toString() {
//        return String.format("Заказ принят " + isMakeOrder
//                + "\n Заказ выдан " + isTakeOrder);
        return this.name;
    }
}
