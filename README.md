# POO_Paquetes

- Los paquetes son como contenedores que nos permite agrupar y organizar las clases.
- Evitan conflictos entre nombres de clases.
- Segun modificadores pueden ocultarse al acceso a sus clases y/o a sus miembros.

# Estándar de nombres en paquetes

- Deben de estar escritos completamente en minúscula y los subpaquetes se separan con un punto.
- Normalmente las expresas utilizan la extención con su dominio (com, or ges, cl, gt).
- seguido del nombre del dominio. Por ejemplo com.google, gt.ejemplo
- Ejemplo de paquete principal --> com.figueroa.proyectoa
- Ejemplo de sub-paquete --> com.figueroa.soporte.proyectoa

# Definiendo paquetes en la clase
- Se utiliza la palabra reservada "pakage" seguido del nombre del paquete.
Ejemplo: --> pakage com.figueroa.datos
- Luego para utilizar la clase la debemos de importar con "import" --> import  com.figueroa.datos.Persona


- El import lo que hace es habilitar una clase para que podamos utilizarla, funciona como un alias.


# Control de Acceso mediante modificadores

- public: Se puede acceder desde donde sea.
- private: Que se encuentre en la misma clase.
- protected: Que se encuentren en el mismo paquete.