function validerForm() {
	
	let formValid = document.getElementById("form");
	
    let numEnseignantElement =
        document.getElementById("numero_enseignant");
    let numEnseignant = numEnseignantElement.value;

    if(numEnseignant === "") {
    	numEnseignantElement.classList.add("erreur");
    } else {
    	numEnseignantElement.classList.remove("erreur");
    }
    
    let lesClassErreur = document.getElementsByClassName("erreur");
    
    if(lesClassErreur.length === 0) {
    	formValid.submit();
    }
}