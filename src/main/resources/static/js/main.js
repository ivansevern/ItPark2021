    const rates = {};
    //Элементы для отображения курса валют
    const elementUSD = document.querySelector('[data-value="USD"]');
    const elementEUR = document.querySelector('[data-value="EUR"]');

    //Элементы формы, ввод суммы, выбор валюты, поле с результатом
    const  input = document.querySelector('#input');
    const  result = document.querySelector('#result');
    const  select = document.querySelector('#select');

    getCurrencies();

    //Функция получения курса валют и отображения их на странице
    async function getCurrencies() {
        const response = await fetch('https://www.cbr-xml-daily.ru/daily_json.js');
        const data = await response.json();
        const result = await data;
        console.log(result);

        rates.USD = result.Valute.USD;
        rates.EUR = result.Valute.EUR;

        console.log(rates);

        elementUSD.textContent = rates.USD.Value.toFixed(2);
        elementEUR.textContent = rates.EUR.Value.toFixed(2);

        //Цвет для визуализации изменения курса USD
        if (rates.USD.Value > rates.USD.Previous) {
            elementUSD.classList.add('top');
        } else {
            elementUSD.classList.add('bottom');
        }

        //Цвет для визуализации изменения курса EUR
        if (rates.EUR.Value > rates.EUR.Previous) {
            elementEUR.classList.add('top');
        } else {
            elementUSD.classList.add('bottom');
        }
    }

    input.oninput = convertValue;
    select.oninput = convertValue;

    function convertValue() {
        result.value = (parseFloat(input.value) / rates[select.value].Value).toFixed(2);
    }
