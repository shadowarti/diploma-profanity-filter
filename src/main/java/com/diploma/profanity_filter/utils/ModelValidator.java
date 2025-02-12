package com.diploma.profanity_filter.utils;

import com.diploma.profanity_filter.exceptions.ParamDoesNotExist;
import com.diploma.profanity_filter.models.InputModel;

public class ModelValidator {

    public InputModel validateInputModel (InputModel inputModel){
        if (inputModel.getText() == null || inputModel.getText().isBlank()){
            throw new ParamDoesNotExist("Text");
        }

        return inputModel;
    }
}
