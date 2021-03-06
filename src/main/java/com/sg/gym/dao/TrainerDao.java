/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.gym.dao;

/**
 *
 * @author mawidemess
 */
import com.sg.gym.model.Trainer;
import java.util.List;

/**
 *
 * @author farhanshahbaz
 */
public interface TrainerDao {
    Trainer getTrainerById(int id);
    List<Trainer> getAllTrainers();
    Trainer addTrainer(Trainer trainer);
    void updateTrainer(Trainer trainer);
    void deleteTrainerById(int id);
    
}
