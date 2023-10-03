public class Main {
    public static void main(String[] args) {
        Market store = new Market();
        Human george = new Human();
        george.setName("Жорик ");
        Human maria = new Human();
        maria.setName("Дарья ");
        Human paul = new Human();
        paul.setName("Павел ");
        Human ralph = new Human();
        ralph.setName("Иосиф ");
        Human andrew = new Human();
        andrew.setName("Инокентий ");

        store.acceptToMarket(george);
        store.takeInQueue(george);
        store.update();

        store.acceptToMarket(maria);
        store.acceptToMarket(paul);
        store.acceptToMarket(ralph);
        store.acceptToMarket(andrew);
        store.takeInQueue(maria);
        store.takeInQueue(paul);
        store.takeInQueue(ralph);
        store.update();
        store.update();
        store.releaseFromMarket(Market.clients);


    }
}
