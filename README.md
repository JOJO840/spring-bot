## Part 1 - Setup:

• Initialize a new Spring Boot project with following required dependencies:<br>
&nbsp;&nbsp;&nbsp;&nbsp;◦ Spring Web<br>
&nbsp;&nbsp;&nbsp;&nbsp;◦ Spring Data JPA<br>
&nbsp;&nbsp;&nbsp;&nbsp;◦ MySQL Driver<br>
&nbsp;&nbsp;&nbsp;&nbsp;◦ H2 Database (for testing)<br>
&nbsp;&nbsp;&nbsp;&nbsp;◦ Lombok<br>
<br>
• Make sure you have created a database in MySQL.<br>
• Configure your production MySQL DataSource with `application.properties` file.<br>
• Change `pom.xml` H2 dependency to be active in test by changing:<br>
&nbsp;&nbsp;&nbsp;&nbsp;`<scope>runtime</scope>` → `<scope>test</scope>`<br>
• Create `resources` directory in the `test` directory.<br>
&nbsp;&nbsp;&nbsp;&nbsp;(Should come up as a suggestion once you right-click the test folder)<br>
• Configure your H2 database with an `application.properties` file inside the test resources folder.<br>
&nbsp;&nbsp;&nbsp;&nbsp;(This will override the main one during tests.)<br>
• Verify that your application starts without errors.<br>
• Make a commit in Git history.<br>
