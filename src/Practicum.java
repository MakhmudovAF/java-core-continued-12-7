import java.util.Optional;

public class Practicum {
    public static void main(String[] args) {
        SearchService searchService = new SearchService();
        Optional<Candy> result = searchService.search("Африка");

        if (result.isPresent()) {
            Candy candy = result.get();
            System.out.printf("Товар \"%s\" доступен в количестве %d кг по цене %.2f руб за кг%n",
                    candy.name, candy.amount, candy.price);
        } else {
            System.out.println("Данный товар не найден");
        }
    }
}