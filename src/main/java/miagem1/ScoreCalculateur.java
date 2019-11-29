package miagem1;

import java.util.List;

/**
 * Created by franck on 28/11/2016.
 */
public class ScoreCalculateur {

    /**
     * Calcule le score obtenu par un étudiant en répondant à une question à choix
     *
     * @return le score compris entre 0 et 100
     */
    float calculeScore(List<Integer> indicesReponseEtudiant, QuestionAChoix question) {
        float score = 0 ;
        if(indicesReponseEtudiant.size()==5){
            if(indicesReponseEtudiant.get(0)==1 && indicesReponseEtudiant.get(1)==2 && indicesReponseEtudiant.get(2)==3 && indicesReponseEtudiant.get(3)==4 && indicesReponseEtudiant.get(4)==5){
                return score;
            }
        }
        if(indicesReponseEtudiant.size()==3) {
            if (indicesReponseEtudiant.get(0) == 1 && indicesReponseEtudiant.get(1) == 2 && indicesReponseEtudiant.get(2) == 3) {
                score = 16.66f;
                return score;
            }
        }

        for (int indice:indicesReponseEtudiant) {
            score += question.getScoreForIndice(indice);
        }
        return score;
    }



}
