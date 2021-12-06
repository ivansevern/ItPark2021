package lesson11;

/*
* Необходимо симулировать дорожную ситуацию с возможностью проезда через КПП.
* Приложение поддерживает работу с автомобилями двух типов: легового и грузового.
* Оба типа имеют такие характеристики, как номер автомобиля, скорость передвижения, собственный вес,
габариты (ширина, высота и длина).
* Если автомобиль двигается со скоростью, превышающую допустимые 80 км/ч, должна генерироваться исключительная ситуация,
* сообщающая об этом.
* Если данное превышение составляет более 100 км/ч, должна быть привлечена полиция, которая ловит преступника и также
в консоль сообщается об этом с указанием номера автомобиля.
* При проезде КПП учитываются размеры авто, допустим проезд легкового и грузового транспорта с соблюдением след. условий:
* 1. Вес автомобиля не должен превышать 8 тон (в противном случае генерируется исключение о невозможности проезда и
указании номера авто и его типа).
* 2. Габариты авто не должны превышать 4 м высоты и 2.5 м ширины (иначе генерируется исключение, указанное в п.1).
* На вход программе передается несколько десятков автомобилей различных типов и различных характеристик (способ
генерации не важен: запрос у пользователя черезконсоль или заранее подготовленные экземпляры).
* Эмулировать проезд автомобилей через КПП с учётом выше объявленных проверок.
* (IllegalArgumentException throw)
*  */

public class KPPRunner {
    public static void main(String[] args) {

    }

}
