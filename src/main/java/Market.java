import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour,MarketBehaviour{
    static ArrayList<Actor> clients = new ArrayList<>(); // посетители магазина
    Queue<Actor> queue = new ArrayDeque<>(); // очередь за заказом

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.print(actor.getName() + "Заходит в магазин. ");
        clients.add(actor);
        System.out.println("Количество людей в магазине: " + (clients.size()+queue.size()));
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (int i = 0; i < actors.size(); i++) {
            if(actors.get(i).isTakeOrder) {
                System.out.print(actors.get(i).getName() + " Покинул магазин. ");
                actors.remove(actors.get(i));
                System.out.println("Количество людей в магазине: " + (clients.size()+queue.size()));
            }
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
    }

    @Override
    public void takeInQueue(Actor actor) {
        if(clients.contains(actor)) {
            System.out.print(actor.getName() + " Стоит в очереди. ");
            queue.add(actor);
            System.out.println("Очередь увеличилась до  " + queue.size());
            clients.remove(actor);
        }
    }

    @Override
    public void takeOrders() {
        if(queue.peek() != null) {
            queue.peek().isMakeOrder = true;
            System.out.println(queue.peek().getName() + " Сделал заказ");
        }
    }

    @Override
    public void giveOrders() {
        if(queue.peek() != null) {
            queue.peek().isTakeOrder = true;
            System.out.println(queue.peek().getName() + " Получичл заказ");
            releaseFromQueue();
        }
    }

    @Override
    public void releaseFromQueue() {
        assert queue.peek() != null;
        System.out.print(queue.peek().getName() + " Покинул очередь. ");
            clients.add(queue.poll());
            System.out.print(queue.size() + " Клиенты ");
            System.out.print(queue.toString());
            System.out.println(" Осталось стоять в очереди.");
    }
}
