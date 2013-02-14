function checkForms(type){
    try{
        var regexChecker = /^[\d]/;
        if(type == "rectangle"){
            if (regexChecker.test(rectangleAreaCalculator.txtWidth.value)==false){
                rectangleAreaCalculator.txtWidth.focus();
                throw new Error("You need a positive, numeric value in this field.");
            }else if (regexChecker.test(rectangleAreaCalculator.txtHeight.value)==false){
                rectangleAreaCalculator.txtHeight.focus();
                throw new Error("You need a positive, numeric value in this field.");
            }
            return(true);
        }else if (type == "circle"){
            if (regexChecker.test(circleAreaCalculator.txtRadius.value)==false){
                circleAreaCalculator.txtRadius.focus();
                throw new Error("You need a positive, numeric value in this field.");
            }
            return(true);
        }else if (type == "triangleSide"){
            if (regexChecker.test(triangleSideCalculator.txtSideA.value)==false){
                triangleSideCalculator.txtSideA.focus();
                throw new Error("You need a positive, numeric value in this field.");
            }else if (regexChecker.test(triangleSideCalculator.txtSideB.value)==false){
                triangleSideCalculator.txtSideB.focus();
                throw new Error("You need a positive, numeric value in this field.");
            }
            return(true);
        }
        return(false);
    }catch(err){
        alert(err);
        return (false);
    }
}