package aula03.lista03;

public class ClasseControle {

        Integer volumeMaximo=100, canalMaximo=50;

        ClasseTV t = new ClasseTV();

        void aumentarVolume(){
            Integer volume = t.getVolume();
            if(volume < volumeMaximo){
                volume++;
                t.setVolume(volume);
            }else{
                System.out.println("Volume esta no maximo");
            }
        }

        void diminuirVolume(){

        }

        void subirCanal(){

        }

        void descerCanal(){

        }

}
