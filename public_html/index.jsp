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
    <table border="1" id="mainContainer">
      <tr id="questionNumberRow">
          <td id="questionNumberData">Question number goes here</td>
      </tr>
      <tr id="questionRow">
          <td id="questionData">Question goes here</td>
      </tr>
      <tr id="answersRow">
          <td id="answersData">
              <input type="radio" name="answer" value="1">Answer 1<br>
              <input type="radio" name="answer" value="2">Answer 2<br>
              <input type="radio" name="answer" value="3">Answer 3
          </td>
      </tr>
      <tr id="submitRow">
          <td id="submitData">
              <input type="button" value="submit" id="submit">
          </td>
      </tr>
    </table>
  </body>
</html>