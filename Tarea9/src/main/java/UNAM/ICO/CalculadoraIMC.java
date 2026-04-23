package UNAM.ICO;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class CalculadoraIMC {
    private double peso;
    private double altura;
    private double imc;

    public void calcularIMC(){
        this.imc = this.peso / (this.altura * this.altura);
    }
}
