package miagem1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class QuestionAChoixMultipleTest {

    private QuestionAChoixMultiple question;
    private List<Integer> indicesBonnesReponses;

    @Before
    public void setUp() throws Exception {
        // given : une instande de question à choix exclusif
        indicesBonnesReponses = new ArrayList<>();
        indicesBonnesReponses.add(1);
        indicesBonnesReponses.add(3);
        question = new QuestionAChoixMultiple("un énoncé à choix multiple", indicesBonnesReponses);
    }

    @Test
    public void testGetEnonce() {
        //when : On demande l'énoncé de la question
        String resEnonce = question.getEnonce();
        // then : l'énoncé retourné est l'énoncé fournit à la construction de la question
        assertEquals("un énoncé à choix multiple", resEnonce);
    }

    @Test
    public void testGetScoreForIndice() {
        // when : Quand l'étudiant fournit l'indice des bonnes réponses
        int indiceEtudiant = 1;
        // and : on demande le score de l'indice à la question
        float resScore = question.getScoreForIndice(indiceEtudiant);
        // then : le score obtenu est 100
        assertEquals(100f/((float)(indicesBonnesReponses.size())), resScore, 0.01f);
    }

    @Test
    public void testGetScoreForIndiceFaux() {
        // when : Quand l'étudiant fournit l'indice des bonnes réponses
        int indiceEtudiant = 2;
        // and : on demande le score de l'indice à la question
        float resScore = question.getScoreForIndice(indiceEtudiant);
        // then : le score obtenu est 100
        assertEquals(0f, resScore, 0.01f);
    }
}