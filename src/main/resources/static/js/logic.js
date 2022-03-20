// $(document).ready(function() {
    $(function () {
        var element = {
            'field1' : 'example',
            'value' : 125.0        };
        let elementAsString = JSON.stringify(element);
        JSON.parse(elementAsString);
        $('#input').blur(function() {  //#inputText
            let val = $(this).val();
            if (!val) {
                $('#errorLabel').css('display', 'block');
            } else {
                $('#errorLabel').hide();
            }
        });
    });
