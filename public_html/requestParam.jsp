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
    <h1>Flash Cards with Team MLJ</h1>

    <form action="/java112/mlj-servlet" method="GET">

    <table border="1" id="mainContainer">
      <tr id="answersRow">
          <td id="answersData">
              <div id="question1" class="questions">Which type of key will not open a door?
                  <input type="text" name="answer1"/>
              </div><br>
              <div id="question2" class="questions">What did the turkey say to the computer?
                  <input type="text" name="answer2"/>
              </div><br>
          </td>
      </tr>
      <tr id="submitRow">
          <td id="submitData">
              <div id="buttonContainer">
                <input class="buttons" type="button" name="next" id="next" value="next question" />
                <input class="buttons" type="submit" name="submit" value="Submit" id="submit" />
              </div>
          </td>
      </tr>
    </table>
    </form>
  </body>

</html>

  
</html>