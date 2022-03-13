//Элемент для вывода евро
const EURviuw = document.querySelector('.eur')
//Элемент для вывода доллара
const USDviuw = document.querySelector('.usd')
//Вывод перевода из евро в рубли
const  eurInRub = document.querySelector('.eur-in-rub')
//Input для евро
const eurInput = document.querySelector('.eur-input')
//Вывод перевода из доллара в рубли
const  usdInRub = document.querySelector('.usd-in-rub')
//Input для доллара
const usdInput = document.querySelector('.usd-input')

//Объект валют
const valute = {
    EUR: "",
    USD: ""
}
//Делаем GET запрос на сервер
axios.get("http://www.cbr-xml-daily.ru/daily_json.js")
    .then((res) => { //получаем результат
        //берем евро
        valute.EUR = res.data.Valute.EUR.Value
        //берем доллар
        valute.USD = res.data.Valute.USD.Value
        //выводим евро
        EURviuw.textContent = valute.EUR
        //выводим доллар
        USDviuw.textContent = valute.USD
    })

//Отслеживаем события изменения input евро
eurInput.addEventListener('change', () => {
    //Если Input евро не число то
    if (!Number.isInteger(+eurInput.value)) {
        //Выводим ошибку
        eurInRub.textContent = "Вы ввели не число"
    } else if (eurInput.value === '') { //если евро пустая строка
        //Выводит ноль
        eurInRub.textContent = 0
    } else { //Иначе
        //Выводим конвертированный курс
        eurInRub.textContent = Math.round(+eurInput.value * valute.EUR) + " Руб"
    }
})

//Отслеживаем события изменения input доллара
usdInput.addEventListener('change', () => {
    //Если Input доллар не число то
    if (!Number.isInteger(+usdInput.value)) {
        //Выводим ошибку
        usdInRub.textContent = "Вы ввели не число"
    } else if (usdInput.value === '') { //если доллар пустая строка
        //Выводит ноль
        usdInRub.textContent = 0
    } else { //Иначе
        //Выводим конвертированный курс
        usdInRub.textContent = Math.round(+usdInput.value * valute.USD) + " Руб"
    }
})