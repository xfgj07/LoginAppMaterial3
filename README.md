# LoginApp Material 3

Prototipo de interfaz de **Login** para Android, desarrollado en **Java** con **Material 3** y **Material You** (color dinámico).

Proyecto de la materia **Interfaces Móviles**, 2da evaluación.

## Características

- Pantalla de inicio de sesión con diseño Material 3
- Campos de correo y contraseña con botón para mostrar u ocultar la contraseña
- Validación de datos con mensajes de error en cada campo
- Pantalla de bienvenida al iniciar sesión correctamente
- Color dinámico (Material You) en Android 12 o superior
- Soporte de modo claro y modo oscuro

## Tecnologías

- Android Studio
- Java
- XML con Material Components (`com.google.android.material:material`)
- Figma (bocetos, wireframes y mockups)

## Estructura del proyecto

```
app/src/main/
├── java/com/example/loginapp/
│   ├── LoginActivity.java    # Pantalla de login y validación
│   ├── HomeActivity.java     # Pantalla de bienvenida
│   └── MyApp.java            # Activa Material You (color dinámico)
├── res/
│   ├── layout/               # activity_login.xml, activity_home.xml
│   ├── drawable/             # ic_lock.xml
│   └── values/               # themes.xml (tema Material 3)
└── AndroidManifest.xml
```

## Credenciales de prueba

| Campo | Valor |
|---|---|
| Correo | `admin@test.com` |
| Contraseña | `123456` |

## Cómo ejecutar el proyecto

1. Clona el repositorio:
   ```bash
   https://github.com/xfgj07/LoginAppMaterial3
   ```
2. Abre la carpeta en **Android Studio**.
3. Espera a que termine el **Gradle Sync**.
4. Elige un emulador (se recomienda API 31 o superior para ver Material You) o un celular conectado.
5. Presiona **Run ▶**.

## Documentación

La documentación completa (investigación y arquitectura, bocetos, wireframes, mockups y capturas de la implementación) está en la carpeta [`docs`](docs).

## Autor

- **Nombre:** González Juárez Ximena Fernanda
- **Grupo:** 7S2
- **Materia:** Interfaces Móviles
