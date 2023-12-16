/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shared;

import javax.swing.JOptionPane;



public class FrmMensajeSistema {
    public FrmMensajeSistema(){
        
    }
    //----------------InterCtaegoria---------------------//
    public static void mensajeCamposVacios(){
        JOptionPane.showMessageDialog(null, "Acceso denegado: Complete todos los campos");
    }
    public static void mensajeCamposIncorrectos(){
        JOptionPane.showMessageDialog(null, "Usuario o Clave Incorrectos");
    }
    //----------------InterActualizarStock---------------------//
    public static void mensajeStockActualizado(){
        JOptionPane.showMessageDialog(null, "Stock Actualizado");
    }
    public static void mensajeErrorActualizarStock(){
        JOptionPane.showMessageDialog(null, "Hubo un error al actualizar el stock");
    }
    public static void mensajeCantidadNoPermitida(){
        JOptionPane.showMessageDialog(null, "La cantidad no puede ser cero ni negativa");
    }
    public static void mensajeCaracterIncorrecto(){
        JOptionPane.showMessageDialog(null, "En la cantidad no se admiten caracteres no numericos");
    }
    public static void mensajeIngresarNuevaCantidadStock(){
        JOptionPane.showMessageDialog(null, "Ingrese una nueva cantidad adicional al stock existente");
    }
    public static void mensajeProductoSinSeleccionar(){
        JOptionPane.showMessageDialog(null, "Seleccione un producto");
    }
    //----------------InterCategoria---------------------//
    public static void mensajeStockCompletarCampos(){
        JOptionPane.showMessageDialog(null, "Debe digitar la categoria");
    }
    public static void mensajeStockRegistroGuardado(){
        JOptionPane.showMessageDialog(null, "Categoria guardada con exito");
    }
    public static void mensajeStockErrorGuardarRegistro(){
        JOptionPane.showMessageDialog(null, "Error al Guardar");
    }
    public static void mensajeStockCategoriaExistente(){
        JOptionPane.showMessageDialog(null, "Categoria ya registrada");
    }
    //----------------InterCliente---------------------//
}
