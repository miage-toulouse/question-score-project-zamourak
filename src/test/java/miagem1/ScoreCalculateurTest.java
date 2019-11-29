package miagem1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ScoreCalculateurTest {
    private QuestionAChoixMultiple questionAChoixMultiple;
    private ArrayList<Integer> reponsesEtudiant;
    private ScoreCalculateur scoreCalculateur;

    @Before
    public void setUp() throws Exception {
        // given : une instance de question
        reponsesEtudiant = new ArrayList<Integer>();
        questionAChoixMultiple = new QuestionAChoixMultiple("q1",new ArrayList<Integer>(Arrays.asList(2,3,5)));

    }
    @Test
    public void testCalculeScoreCas1() {
        // when : on demande son énoncé à la question
        reponsesEtudiant.add(1);
        reponsesEtudiant.add(4);
        scoreCalculateur = new ScoreCalculateur();
        float resScore = scoreCalculateur.calculeScore(reponsesEtudiant, questionAChoixMultiple);
        // then : l'énoncé retourné est l'énoncé fournit à la construction de la question
        assertEquals(0f, resScore, 0.01f);
        reponsesEtudiant.clear();
    }
    @Test
    public void testCalculeScoreCas2() {
        // when : on demande son énoncé à la question
        reponsesEtudiant.add(2);
        reponsesEtudiant.add(3);
        scoreCalculateur = new ScoreCalculateur();
        float resScore = scoreCalculateur.calculeScore(reponsesEtudiant, questionAChoixMultiple);
        // then : l'énoncé retourné est l'énoncé fournit à la construction de la question
        assertEquals(2*100/3f, resScore, 0.01f);
        reponsesEtudiant.clear();
    }
    @Test
    public void testCalculeScoreCas3() {
        // when : on demande son énoncé à la question
        reponsesEtudiant.add(2);
        reponsesEtudiant.add(3);
        reponsesEtudiant.add(5);
        scoreCalculateur = new ScoreCalculateur();
        float resScore = scoreCalculateur.calculeScore(reponsesEtudiant, questionAChoixMultiple);
        // then : l'énoncé retourné est l'énoncé fournit à la construction de la question
        assertEquals(100f, resScore, 0.01f);
        reponsesEtudiant.clear();
    }
    @Test
    public void testCalculeScoreCas4() {
        // when : on demande son énoncé à la question
        reponsesEtudiant.add(1);
        reponsesEtudiant.add(2);
        reponsesEtudiant.add(3);
        reponsesEtudiant.add(4);
        reponsesEtudiant.add(5);
        scoreCalculateur = new ScoreCalculateur();
        float resScore = scoreCalculateur.calculeScore(reponsesEtudiant, questionAChoixMultiple);
        // then : l'énoncé retourné est l'énoncé fournit à la construction de la question
        assertEquals(0f, resScore, 0.01f);
        reponsesEtudiant.clear();
    }
    @Test
    public void testCalculeScoreCas5() {
        // when : on demande son énoncé à la question
        reponsesEtudiant.add(1);
        reponsesEtudiant.add(2);
        reponsesEtudiant.add(3);
        scoreCalculateur = new ScoreCalculateur();
        float resScore = scoreCalculateur.calculeScore(reponsesEtudiant, questionAChoixMultiple);
        // then : l'énoncé retourné est l'énoncé fournit à la construction de la question
        assertEquals(16.66f, resScore, 0.01f);
        reponsesEtudiant.clear();
    }
}