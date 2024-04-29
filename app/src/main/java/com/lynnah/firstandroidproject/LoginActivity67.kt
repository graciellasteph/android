import android.content.Intent
import android.media.Image
import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.ComponentActivity
import com.Lynnah.firstandroidproject.R
import com.Lynnah.firstandroidproject.ui.theme.FirstAndroidProjectTheme
import com.lynnah.firstandroidproject.HelloWorld

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstAndroidProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }

    private fun setContent(content: @Composable () -> Unit) {

    }

    @Composable
    fun LoginScreen(name: String) {
        Column {
//       Text(
//           modifier = Modifier
//               .background(Color.Blue)
//               .padding(20.dp)
//               .wrapContentHeight(align = Alignment.CenterVertically),
//           text ="Hey $name!Welcome Back",
//           fontsize = 23.sp,
//           color = Color.Red,
//           fontFamily = FontFamily.Serif,
//           fontStyle = FontStyle.Normal,
//           textAlign = TextAlign.Start,
//
//
//           )
            ImageComponent()
            Spacer(modifier = Modifier.height(20.dp))
            TextFieldComponent()
            Spacer(modifier = Modifier.height(20.dp))
            TextFieldEmailComponent()
            Spacer(modifier = Modifier.height(20.dp))
            TextFieldLocationComponent()
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                colors = ButtonDefaults.buttonColors(Color.Green)
            ) {
                Text(text = "Login Here")
            }
            Button(
                onClick = {

                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                colors = ButtonDefaults.buttonColors(Color.Red)
            ) {
                Text(text = "Register ")

            }
        }

//       Text(text = "I am a software developer/Android developer",
//           fontsize = 23.sp,
//           color = Color.Red,
//           fontFamily = FontFamily.SansSerif,
//           fontStyle = FontStyle.Italic,
//           textAlign = TextAlign.Center, modifier = Modifier.background(Color.Blue)
//               .padding(20.dp)
//               .wrapContentHeight(align = Alignment.CenterVertically))


    }


    @Preview(showSystemUi = true, showBackground = true)
    @Composable
    fun HelloWorldPreview() {
        HelloWorld("Brian")

    }

    @Composable
    fun TextFieldComponent() {
        var text by remember {
            mutableStateOf(value = "")
        }
        TextField(modifier = Modifier.fillMaxWidth(),
            value = text, onValueChange = {

            },
            label = { Text(text = "Enter your Name") },
            placeholder = {
                Text(text = "Please Enter your Name")
            })
    }

    @Composable
    fun TextFieldEmailComponent() {
        var text by remember {
            mutableStateOf(value = "")
        }
        TextField(modifier = Modifier.fillMaxWidth(),
            value = text, onValueChange = {

            },
            label = { Text(text = "Enter your Email") },
            placeholder = {
                Text(text = "Please Enter your Email")
            })
    }

    @Composable
    fun TextFieldLocationComponent() {
        var text by remember {
            mutableStateOf(value = "")
        }

        TextField(modifier = Modifier.fillMaxWidth(),
            value = text, onValueChange = {

            },
            label = { Text(text = "Enter your Location") },
            placeholder = {
                Text(text = "Please Enter your Location")
            })
    }

    @Composable
    fun PasswordTextField() {
        var password by rememberSaveable { mutableStateOf("") }
        var passwordVisibility by remember { mutableStateOf(false) }

        val icon = if (passwordVisibility)
            painterResource(id = R.drawable.design_ic_visibility)
        else
            painterResource(id = R.drawable.design_ic_visibility_off)

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = password,
            onValueChange = {
                password = it
            },
            placeholder = { Text(text = "Password") },
            label = { Text(text = "Password") },
            trailingIcon = {
                IconButton(onClick = {
                    passwordVisibility = !passwordVisibility
                }) {
                    Icon(
                        painter = icon,
                        contentDescription = "Visibility Icon"
                    )

                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            visualTransformation = if (passwordVisibility) VisualTransformation.None
            else PasswordVisualTransformation()
        )
    }

    @Composable
    fun ImageComponent() {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "my logo"
        )
    }
}




