//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

import java.util.HashSet;
import java.util.Set;

import java.util.HashMap;
import java.util.Map;

import java.util.stream.Collectors;

void main() {
    // for (int i = 1; i <= 5; i++) {
    //     // TIP Press <shortcut actionId="Debug"/> to start debugging your code...
    //     // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBr...
    //     IO.println("i = " + i);
    // }

    //Dog d1 = new Dog();
  //  Dog d2 = new Dog();

   // d1.setName("Late");
    //d1.setBreed("Siberian Husky");
    //d1.setAge((byte) 3); // ใส่ cast (byte) เพื่อไม่ให้ติด Error "possible lossy conversion from int to byte"

   // IO.print(String.format("Hello my name's %s", d1.getName()));
   // IO.print(String.format(" my breed is %s", d1.getBreed()));
   // IO.print(String.format(" i'm %d years old", d1.getAge()));
//}
// d1.run();
// d1.bark(3);
// Bicycle bike1 = new Bicycle();
// bike1.move();
// bike1.Stop();
// motoBike Moto1=new MotoBike();
// moto1.pushStart();
// moto1.move();
// moto1.stop();
// CreditPayment man1 = new CreditPayment();
// man1.pay(120);
// man2.pay(120);
// }
   // List<String> fruits = new ArrayList<>();
  //  fruits.add("apple");
   // fruits.add("banana");
 //   fruits.add("orange");
    // เพิ่มบรรทัดนี้เพื่อประกาศตัวแปร fruits
   // String[] fruits = {"Apple", "Banana", "Orange"};

   // for (String fruit : fruits) {
  //      System.out.println(fruit);
  //  }

  //  Map<Integer, String> employees = new HashMap<>();
   // employees.put(101, "สมชาย");
   // employees.put(102, "สมหญิง");
   // employees.put(103, "ประชา");
  //  employees.put(101, "สมชาย ใจดี");

  //  System.out.println("พนักงานรหัส 102 คือ: " + employees.get(102));
  //  System.out.println("พนักงานรหัส 101 คือ: " + employees.get(101));

  //  System.out.println("มีรหัส 103 ไหม? " + employees.containsKey(103)); // true
   // employees.remove(103); // ลบข้อมูลที่มี Key เป็น 103 ออก
  //  System.out.println("จำนวนพนักงานทั้งหมด: " + employees.size()); // แสดงผล: 2

  //  for (Map.Entry<Integer, String> entry : employees.entrySet()) {
   //     System.out.println("รหัส: " + entry.getKey() + ", ชื่อ: " + entry.getValue());
  //  }
  //  Set<String> colors = new HashSet<>();

 //   colors.add("Red");
  //  colors.add("Green");
 //   colors.add("Blue");
  //  colors.add("Red"); // ข้อมูลซ้ำ! Java จะไม่เพิ่มตัวนี้เข้าไปใหม่

    // 3. ตรวจสอบขนาดของ Set (จะเห็นว่ามีแค่ 3 สี เพราะ Red ซ้ำถูกคัดออก)
 //   System.out.println("จำนวนทั้งหมด: " + colors.size()); // แสดงผล: 3

    // 4. การตรวจสอบว่ามีข้อมูลนี้อยู่หรือไม่ (contains)
  //  System.out.println("มี Green ไหม? " + colors.contains("Green")); // true

    // 5. การลบข้อมูล (remove)
  //  colors.remove("Blue");

    // 6. การวนลูปแสดงข้อมูลทั้งหมด (เนื่องจากไม่มี Index จึงนิยมใช้ for-each)
  //  for (String color : colors) {
 //       System.out.println("สี: " + color);
  //  }
    //List<String> filteredNames = employees.stream()
     //       .filter(e -> e.getSalary() > 20000)      // 1. กรองเฉพาะเงินเดือน > 20000
   //         .map(e -> e.getName().toUpperCase())     // 2. แปลงชื่อเป็นตัวพิมพ์ใหญ่
    //        .sorted()                                 // 3. เรียงลำดับตามตัวอักษร
     //       .collect(Collectors.toList());            // 4. รวบรวมผลลัพธ์เก็บกลับเป็น List
}
