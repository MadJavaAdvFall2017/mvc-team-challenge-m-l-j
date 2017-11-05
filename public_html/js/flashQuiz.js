$(document).ready(function() {
    var questions = $('.questions');
    var currentQuestion = 1;

    function hideShowQuestion() {
        var cq = currentQuestion.toString();
        $(questions).each(function(){
            if(this.id.substring(8) === cq){
                $('#' + this.id).css("visibility", "visible");
                console.log(this.id + 'is visible');
            } else {
                $('#' + this.id).css("visibility", "hidden");
                console.log(this.id + 'is hiddend');
            }
        });
    }

    hideShowQuestion();

    $('#next').click(function(){
        currentQuestion++;
        if(currentQuestion >= questions.length){
            $('#submit').css("visibility", "visible");
            $('#next').css("visibility", "hidden");
        }

        hideShowQuestion();
    })
    console.log('still here');

});