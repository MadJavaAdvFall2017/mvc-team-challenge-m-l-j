<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>title</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/theme.css">
    <script src="js/flashQuiz.js"></script>
  </head>
  <body>
    <h1>Flash Cards</h1>
    <form>
    <table border="1" id="mainContainer">
    <jsp:useBean id="question1"
        type="java112.project3.Question"
        scope="request" />

     ${q1.getFormData}<br />

     <jsp:useBean id="question2"
         type="java112.project3.Question"
         scope="request" />
         
     ${q2.getFormData}<br />

     <jsp:useBean id="question3"
         type="java112.project3.Question"
         scope="request" />

     ${q3.getFormData}<br />

      <tr id="submitRow">
          <td id="submitData">
              <input type="button" value="submit" id="submit">
          </td>
      </tr>
    </table>
    <form>
  </body>
</html>
