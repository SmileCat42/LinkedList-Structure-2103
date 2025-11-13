<h1 align="center"><b>Project LinkedList โปรเจคลิงค์ลิสต์</b></h1>
<p align="center">
And java.LinkedList และการใช้คำสั่งยูทิลลิงค์ลิสต์
</p>

<br><br>หน้าจอล็อคอิน Login Page<br>
![นี่คือรูปหน้าจอ Login](https://github.com/SmileCat42/LinkedList-Structure-2103/blob/master/src/sc/17.png)

<br><br>ส่วนแสดงภาพและรายละเอียด Show detail Page 
![นี่คือรูปหน้าจอ Login](https://github.com/SmileCat42/LinkedList-Structure-2103/blob/master/src/sc/18.png)

<br><br>รายชื่อสินค้าทั้งหมด Table products Page
![นี่คือรูปหน้าจอ Login](https://github.com/SmileCat42/LinkedList-Structure-2103/blob/master/src/sc/19.png)

<br><br>

[English](#english) | [ภาษาไทย](#ภาษาไทย)

<br>

<a id="ภาษาไทย"></a>

<h1 align="center"><b>COS2103</b></h1>
<h3 align="center">Data Structure and Algorithm โครงสร้างข้อมูลและอัลกอริทึม</h3>

<br><br>
<h2 style="text-indent: 2em; text-decoration: underline;">จุดประสงค์ของการทำโปรเจค</h2>
&nbsp;&nbsp;&nbsp;&nbsp;โปรเจคนี้เป็นโปรเจคที่ต่อยอดมาจากโปรเจคอาเรย์ เพื่อจะได้ฝึกการแก้ไขโค้ดจากการใช้โครงเดิม ทำให้อาจารย์แน่ใจด้วยว่าไม่ได้ให้ AI ช่วยทำทั้งหมด เพราะการนำโปรเจคที่มีอยู่แล้วมาปรับเปลี่ยนเป็นอีกรูปแบบหนึ่ง หากไม่มีความรู้พื้นฐานก็จะไม่สามารถจะเอากลับมาทำให้อยู่ในลักษณะหรือหน้าตาแบบเดิมได้ ถึงแม้อาจมีการให้ AI เจนโค้ดสำหรับตกแต่งโปรแกรมหรือสอบถามเนื้อหาปลีกย่อยบ้างเล็กน้อย แต่ทุกครั้งที่ถามจะต้องเข้าใจและใช้งานเป็น อีกทั้งเนื่องจากโครงสร้างประเภท Array, Stack, Queue และ LinkedList เป็นโครงสร้างที่ไม่ได้มีความซับซ้อนมาก อาจารย์จึงอยากให้นักศึกษาเข้าใจแบบจริงๆ โดยการให้นักศึกษาถ่ายทอดความเข้าใจของตนเองผ่านทางโปรแกรม Apache Netbeans เพื่อเป็นการฝึกการใช้งานโปรแกรมเบื้องต้นด้วย โดยการนำไปใช้งานกับอัลกอริทึมในแบบต่างๆ ที่มีการใช้งานบ่อย เช่น การแทรกข้อมูล การลบข้อมูล การค้นหา เป็นต้น
<br>
<br>

<h2 style="text-indent: 2em; text-decoration: underline;">เนื้อหาที่ได้รับ</h2>
1. เข้าใจโครงสร้างทั้งแบบลิงค์ลิสต์ทางเดียวและลิงค์ลิสต์ 2 ทาง ว่าแตกต่างกันอย่างไร ทำงานอย่างไร
<br>2. ทราบถึงข้อจำกัดต่างๆของลิงค์ลิสต์ทั้ง 2 แบบ รวมถึงการใช้งานกับอัลกอริทึมที่จำเป็นต้องเข้าลูปเพื่อท่องโหนด
<br>3. ได้มีการใช้อัลกอริทึมหลากหลายรูปแบบ มีการ import java.util.LinkedList เข้ามาใช้งาน เพื่อทำให้เข้าใจความแตกต่างระหว่างลิงค์ลิสต์แบบปกติและยูทิลลิงค์ลิสต์ 
<br>4. ทำให้นักศึกษาสามารถตัดสินใจเลือกใช้อัลกอริทึมที่เหมาะสมที่สุด มาประยุกต์ใช้งานกับคำสั่งบนลิงค์ลิสต์แต่ละแบบได้ดีที่สุด

<br>
<br>
<h2 style="text-indent: 2em; text-decoration: underline;">การทำงานของอัลกอริทึม</h2>
📄 <a href="src/CodeExplanation/GHlinkedlist.pdf" target="_blank">ดูรายงานผลความเข้าใจผ่านการพิมพ์</a>
<br>    **พิมพ์มือเองทั้งหมด
<br>
<br>
<h2 style="text-indent: 2em; text-decoration: underline;">ผลการเรียนรู้</h2>
📄 <a href="src/CodeExplanation/exam2103.pdf" target="_blank">ข้อสอบ</a>
<br><br>

<h2 style="text-indent: 2em; text-decoration: underline;">ขั้นตอนการเปิดโปรแกรม</h2>
1. ติดตั้งโปรแกรม Apache Netbeans
<br>2. ดาวน์โหลดโปรเจคนี้ลงเครื่อง (ปุ่ม CODE สีเขียว)
<br>3. เปิดโปรแกรม Netbeans เลือกที่ File > Open Project เลือกไฟล์เป็นโปรเจคนี้ที่ดาวน์โหลดไว้
<br>4. สังเกตุแถบซ้ายมือจะมีชื่อไฟล์ที่โหลดมาไอคอนถ้วยกาแฟ กดคลิ็กดรอปดาวน์ลงมา กดลงมาต่อที่ Source Packages กดลงมาต่อที่ linkedlistsports (หรือกดที่ ver.util.LinkedList เพื่อดูฉบับ util.LinkedList)
<br>5. คลิ๊กขวาที่ชื่อไฟล์ Login.java แล้วเลือก Run File
<br><br><br><br>

<a id="english"></a>

<h2 style="text-indent: 2em; text-decoration: underline;">Project Objective</h2>
&nbsp;&nbsp;&nbsp;&nbsp;This project is a continuation of the Project array. purpose to practice modifying and improving code based on existing structure. This also prove teacher make sure that the work is not all done by AI. If student can take an old project and change it into a new version with a similar look and function, it shows that they have real understanding. data structures such as Array, Stack, Queue, and LinkedList are not highly complex, the instructor would like students to gain a true understanding of them by expressing our knowledge through programming in Apache NetBeans. This method also serves as basic practice in using program. The project applying these structures to commonly used algorithms such as insertion, deletion, and searching, among others.
<br>
<br>

<h2 style="text-indent: 2em; text-decoration: underline;">Content Received</h2>
1. Understand linkedlist 1 way and linkedlist 2 ways structure how to work, how are they different
<br>2. Know the limitation of linkedlist structure, including work with algorithm that necessary to enter the loop for traversing node
<br>3. Gain experience using various algorithms, and learn to import java.util.LinkedList to understand the differences between regular linkedlist and java.util.linkedlist
<br>4. Enable students to analyze and choose the most appropriate algorithm to apply effectively with different types of linkedlist operations

<br>
<br>
<h2 style="text-indent: 2em; text-decoration: underline;">Code Explanation</h2>
📄 <a href="src/CodeExplanation/GHlinkedlist.pdf" target="_blank">open report code explanation</a>
<br>    **manually created
<br>
<br>
<h2 style="text-indent: 2em; text-decoration: underline;">Learning Outcomes</h2>
📄 <a href="src/CodeExplanation/exam2103.pdf" target="_blank">Exam</a>
<br>
<br>
<h2 style="text-indent: 2em; text-decoration: underline;">How to open the program</h2>
1. Install Apache NetBeans IDE
<br>2. Download this project to your computer (click green CODE button)
<br>3. Open NetBeans, go to File > Open Project, and select this downloaded project
<br>4. On the left panel, you will see the project name with coffee cup icon, click dropdown arrow to expand it, then open Source Packages → linkedlistsports (→ ver.util.LinkedList for open util.LinkedList version)
<br>5. Right-click on the file Longin.java and select Run File to execute the program.
