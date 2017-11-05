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
    <h1>Thanksgiving Jokes!</h1>
    <div id="linkContainer">
        <a href="mvc">More Jokes!</a>
    </div>
    <div id="question" class="questionAnswer">${myCoolBean.question}</div>
    <div id="answer" class="questionAnswer"><p id="answerText">${myCoolBean.answer}</p></div>
  </body>
</html>