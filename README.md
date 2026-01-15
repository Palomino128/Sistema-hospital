
# 🏥 Sistema-Hospital

**Sistema-Hospital** es una **aplicación Java** que implementa un sistema de gestión hospitalaria básico. Fue desarrollado como proyecto educativo para practicar programación orientada a objetos, estructuras de datos, y lógica de negocio en Java. ([GitHub][1])


## 📌 Descripción

Este proyecto implementa las funcionalidades esenciales de un sistema para administrar aspectos de un hospital, como el registro y gestión de pacientes, personal médico y otras operaciones relacionadas con la atención hospitalaria. Está diseñado para ser ejecutado como una aplicación de escritorio / consola o con interfaz gráfica simple según se desee extender. ([GitHub][1])


## 🛠️ Tecnologías

El proyecto utiliza:

* **Lenguaje:** Java (100%) ([GitHub][1])
* **IDE:** NetBeans (estructura del proyecto) ([GitHub][1])
* **Build system:** Ant (`build.xml`) ([GitHub][1])


## 📁 Estructura del proyecto

```
Sistema-hospital/
├── build/
│   └── classes/                # Archivos compilados Java
├── nbproject/                  # Configuración de NetBeans
├── src/
│   └── sistema/
│       └── hospital/           # Código fuente Java
│           └── ... .java
├── build.xml                   # Script de compilación Ant
├── manifest.mf                 # Archivo de manifiesto
└── README.md
```

Las clases y paquetes dentro de `src/sistema/hospital` representan la lógica del sistema hospitalario (pacientes, médicos, citas, etc.). ([GitHub][1])


## 📥 Requisitos previos

Antes de ejecutar el sistema, asegúrate de tener instalado:

✔ **Java JDK 8 o superior**
✔ **NetBeans IDE** (opcional, recomendado para desarrollo)
✔ **Ant** (si deseas compilar desde línea de comandos)
✔ **Un editor de texto o IDE compatible con Java**

---

## 💻 Instalación y ejecución

### 🧪 Clonar el repositorio

```bash
git clone https://github.com/Palomino128/Sistema-hospital.git
cd Sistema-hospital
```


## ▶️ Ejecución con NetBeans

1. Abre **NetBeans**
2. Selecciona **File → Open Project…**
3. Busca la carpeta `Sistema-hospital` y ábrela
4. Haz clic en **Run Project (F6)**


## ▶️ Compilar y ejecutar desde la terminal

Si tienes **Ant** instalado:

```bash
ant compile
```

Luego ejecuta la clase principal (reemplaza `Main` si corresponde a otra clase si no existe un nombre exacto):

```bash
ant run
```


## 📘 Funcionalidades esperadas *(según estructura de proyecto)*

Aunque no hay descripción dentro del repositorio, típicamente este tipo de sistema puede incluir:

✔ Registro de pacientes
✔ Registro y gestión de médicos y personal
✔ Agendamiento de citas
✔ Gestión de historial médico
✔ Reportes o listados
*(Puedes adaptar esta lista basado en las clases específicas que tengas en `src`)*


## 🧠 Detalles del diseño

El proyecto está organizado en paquetes bajo `sistema.hospital`, permitiendo:

* **Escalabilidad**: agregar nuevos módulos sin romper la arquitectura
* **Modularidad**: separar clases por responsabilidad
* **Reutilización**: clases utilitarias y de lógica compartida


## 📈 Posibles mejoras

Puedes extender el proyecto en varias direcciones futuras:

* 🧾 **Agregar base de datos real:** MySQL, SQLite o PostgreSQL
* 🖼️ **Interfaz gráfica (GUI):** usando JavaFX o Swing
* 🌐 **Convertir a aplicación web:** con Spring Boot o Jakarta EE
* 📊 **Reportes y dashboards** para estadísticas
* 🔐 **Autenticación y roles de usuario**


## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Para colaborar:

1. Haz *fork* del repositorio
2. Crea una rama nueva (`git checkout -b feature/nombre`)
3. Realiza tus cambios
4. Envía un *pull request*


## 📄 Licencia

Actualmente, el proyecto **no declara una licencia** (agrega una como MIT, GPL, Apache, etc., si deseas compartirlo de forma abierta).


