package model;

public class PersonEqualsTest
{
    public static void main(String[] args) {
        Person p=new Person();
        p.setName("Nicole");
        p.setLastName("Ssssss");
        p.setAge(111);
        p.setId(777);

        Person p2=new Person(777,"Nicole","Ssssss",111);

        //I. LINKS OF DIFFERENT OBJECTS ARE ALWAYS DIFFERENT
        System.out.println("p == p1 ? "+ (p==p2) );

        Person p100=p;
        System.out.println("p100==p? "+(p100==p));

        //II EQUALS CHECKS LINKS (LOOK AT PT 1)
        Cat cat1 =new Cat("Murzik");
        Cat cat2 =new Cat("Murzik");
        Person person1=new Person(123,"Mike","Tyson",56);
        person1.setCat(cat1);
        Person person2=new Person(123,"Mike","Tyson",56);
        person2.setCat(cat2);

        //ДЛЯ ТОГО, ЧТОБЫ ОБЪЕКТЫ СРАВНИВАЛИСЬ КОРРЕКТНО НЕОБХОДИМО ПЕРЕОПРЕДЕЛИТЬ МЕТОД EQUALS. КАК ПРАВИЛО ОБЪЕКТЫ СРАВНИВАЮТСЯ ПО ПОЛЯМ
        System.out.println("person1 equals person2 ?"+person1.equals(person2));

        //HASHCODE IS A FUNCTION THAT WILL RETURN THE INT VALUE
        System.out.println("cat1 hashcode: "+cat1.hashCode());
        System.out.println("cat2 hashcode: "+cat2.hashCode());


        System.out.println("person1 hashcode: "+person1.hashCode());
        System.out.println("person2 hashcode: "+person2.hashCode());
    }
}
