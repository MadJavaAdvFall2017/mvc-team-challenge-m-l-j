<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Results</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/theme.css">
     </head>
  <body>
    <h1>Radio Quiz Results</h1>
        <article>
        <p class="answer">  ${question1.number} ${question1.question}<br />
            <it>Your answer: &nbsp ${question1.guess}</it><br />
            <b>Correct answer: &nbsp ${question1.solution}</b></p><br /><br />

          <p class="answer"> ${question2.number} ${question2.question}<br />
            <it>Your answer: &nbsp ${question2.guess}</it><br />
            <b>Correct answer: &nbsp ${question2.solution}</b></p><br /><br />

          <p class="answer"> ${question3.number} ${question3.question}<br />
            <it>Your answer: &nbsp: ${question3.guess}</it><br />
            <b>Correct answer: &nbsp ${question3.solution}</b></p><br /><br /><br />


            <p class="answer">Your score is : &nbsp <b>${request.getAttribute("score")}</b></p><br />

            <div id="linkContainer">
                <a href="index.jsp">Project Home</a>
            </div>


        </article>


  </body>
</html>
