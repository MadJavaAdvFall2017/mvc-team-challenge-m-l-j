<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Radio Quiz</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/theme.css">
     </head>
  <body>
    <h1>Radio Quiz</h1>
    <form action = "results.jsp" method = "GET">
        <p class="answer">  ${question1.number} ${question1.question}<br />
            <input type="hidden" name="solution1" value=${question1.solution}>
            <input type="radio" name="answer1" value="1">${question1.choiceOne}<br />
            <input type="radio" name="answer1" value="2">${question1.choiceTwo}<br />
            <input type="radio" name="answer1" value="3">${question1.choiceThree}</p><br /><br />

        <p class="answer"> ${question2.number} ${question2.question}<br />
            <input type="hidden" name="solution2" value=${question2.solution}>
             <input type="radio" name="answer2" value="1">${question2.choiceOne}<br />
             <input type="radio" name="answer2" value="2">${question2.choiceTwo}<br />
             <input type="radio" name="answer2" value="3">${question2.choiceThree}</p><br /><br />

        <p class="answer"> ${question3.number} ${question3.question}<br />
            <input type="hidden" name="solution3" value=${question3.solution}>
              <input type="radio" name="answer3" value="3">${question3.choiceOne}<br />
              <input type="radio" name="answer3" value="3">${question3.choiceTwo}<br />
              <input type="radio" name="answer3" value="3">${question3.choiceThree}</p><br /><br />


                 <p class="centered"><input type="button" value="submit"><p>








     </form>
  </body>
</html>
