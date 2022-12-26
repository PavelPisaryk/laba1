package laba1;
public class Food implements Consumble {
String name = null;int amount = 0;
public Food(String name) {
this.name = name;
}
public boolean equals(Object arg0) {
if (!(arg0 instanceof Food)) return false; // Шаг 1
if (name==null || ((Food)arg0).name==null) return false; // Шаг 2
return name.equals(((Food)arg0).name); // Шаг 3
}
@Override
public String toString() {
return name + "hello ";
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
// Реализация метода consume() удалена из базового класса Food
// Это можно сделать, потому что сам Food - абстрактный
@Override
public void consume() {
	// TODO Auto-generated method stub
	
}
}
