// const arg2 = document.querySelector('.usd') //элемент для вывода usd
// const  result = document.querySelector('.usd-in-rub')
// const  arg1 = document.querySelector('.usd-input') //ввод для usd

// //объект валют
// const valute = {USD: ""}
//
//запрос на курс
let axios;
axios.get("http://www.cbr-xml-daily.ru/daily_json.js")
    .then((res) => {
        valute.USD = res.data.Valute.USD.Value
        arg2.textContent = valute.USD

    })
//
// //отслеживаем события изменения в usdInput
// arg1.addEventListener('change', () => {
//     //если не число, то
//     if (!Number.isInteger(+arg1.value)) {
//         //выводим ошибку
//         result.textContent = 0
//     } else {
//         result.textContent = Math.round(+usdInput.value / valute.USD) + " Руб"
//     }
// })

$(function () {
    $('#calculate').click(function (){
        let arg1 = $('#arg1').val();
        let arg2 = $('#arg2').textContent();
        // let arg2 = select.oninput = convertValue;
        if (!arg1) {
            $('#arg1').css("border-color", "red");
        } else {
            $('#arg1').css("border", "");
        }

        if (!arg1 || !arg2) {
            alert('Укажите значения!')
            return;
        }
        if (!arg2) {
            $('#arg2').css("border-color", "red");
        } else {
            $('#arg2').css("border", "");
        }

        $.ajax({
            url: '/currencyConverter/result?arg1=' + arg1 / '&arg2=' + arg2,
            type: 'POST',
            success: function (result) {
                $('#result').text('Результат конвертации USD в Руб: ' + result.value);
            }
        });
    });
});