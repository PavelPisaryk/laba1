package laba1;

public class IceCream extends Food {
private String sirup;
	public IceCream(String sirup) {
		super("IceCream");
		this.sirup  = sirup;
	}

	@Override
	public void consume() {
		// TODO Auto-generated method stub
		System.out.println(this + " eaten ");
	}
	// Селектор для доступа к полю данных СИРОП
		public String getSirup() {
		return sirup;
		}
		// Модификатор для изменения поля данных СИРОП
		public void setSize(String size) {
		this.sirup = size;
		}
		public boolean equals(Object arg0) {
			if (super.equals(arg0)) { 
			
			if (!(arg0 instanceof Apple)) return false; 
			return sirup.equals(((IceCream)arg0).sirup); 
			} else
			return false;
			}
			// Переопределѐнная версия метода toString(), возвращающая не только
			// название продукта, но и его размер
			public String toString() {
			return super.toString() + " vcusa'" + sirup.toString() + " ";
			}
			}

