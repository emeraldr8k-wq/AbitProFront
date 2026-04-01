package edu.ITSchool.abitpro.screens

import androidx.annotation.DisplayContext
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Helloscreen(){
    Text(
        text = "Приложение готово к работе.\n" +
                "Остался финальный этап - настройка\n" +
                "фильтров для выдачи подходящих\n" +
                "Вам вузов. Рекомендуем указывать\n" +
                "достоверную информацию, чтобы\n" +
                "получить предложения, которые\n" +
                "подходят Вам лучше всего.\n" +
                "\n" +
                "Все указанные вами данные\n" +
                "храняться на вашем устройстве\n" +
                "локально и ни куда не передаются.",
        color = Color.White
    )

//    Scaffold(
//
//    ) { }


}

@Preview(showBackground = true)
@Composable
fun ShowHello(){
    MaterialTheme {
        Helloscreen()
    }
}

