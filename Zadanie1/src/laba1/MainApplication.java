package laba1;

public class MainApplication {


	public static void main(String[] args) throws Exception {
	
	Food[] breakfast = new Food[20];
	
	int itemsSoFar = 0;
	int AmountCheese = 0;
	int AmountApple = 0;
	int AmountIceCream = 0;
	for (String arg: args) {
	String[] parts = arg.split("/");
	if (parts[0].equals("Cheese")) {
	breakfast[itemsSoFar] = new Cheese();
	AmountCheese++;
	} 	
	
	
	if (parts[0].equals("Apple")) {	
	breakfast[itemsSoFar] = new Apple(parts[1]);
	AmountApple++;
	}
	
	if (parts[0].equals("IceCream")) {
	breakfast[itemsSoFar] = new IceCream(parts[1]);
	AmountIceCream++;
	}
	
		
	// ... Продолжается анализ других продуктов для завтрака
	itemsSoFar++;
	}
	// Перебор всех элементов массива
	for (Food item: breakfast)
	if (item!=null)
	// Если элемент не null – употребить продукт
	item.consume();
	else
	// Если дошли до элемента null – значит достигли конца
	// списка продуктов, ведь 20 элементов в массиве было
	// выделено с запасом, и они могут быть не
	// использованы все
	break;
	
	System.out.print("Cheese: ");
	System.out.println(AmountCheese);
	System.out.print("Apple: ");
	System.out.println(AmountApple);
	System.out.print("IceCream: ");
	System.out.println(AmountIceCream);
	//System.out.print("Total: ");
	//System.out.print(itemsSoFar);
	}
	}
