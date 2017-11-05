<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Radio Quiz</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/theme2.css">
     </head>
  <body>
    <h1>Radio Quiz</h1>
    <form method="POST" action="">
        <p>  ${question1.number} ${question1.question}<br />
            <input type="radio" name="answer1" value="1"> ${question1.choiceOne}<br />
            <input type="radio" name="answer1" value="2">  ${question1.choiceTwo}<br />
            <input type="radio" name="answer1" value="3">  ${question1.choiceThree}</p><br />

        <p> ${question2.number} ${question2.question}<br />
             <input type="radio" name="answer2" value="1"> ${question2.choiceOne}<br />
             <input type="radio" name="answer2" value="2">  ${question2.choiceTwo}<br />
             <input type="radio" name="answer2" value="3">  ${question2.choiceThree}</p><br />

         <p> ${question3.number} ${question3.question}<br />
              <input type="radio" name="answer3" value="3"> ${question3.choiceOne}<br />
              <input type="radio" name="answer3" value="3">  ${question3.choiceTwo}<br />
              <input type="radio" name="answer3" value="3">  ${question3.choiceThree}</p><br />


                 <input type="button" value="submit">








     </form>
  </body>
</html>
