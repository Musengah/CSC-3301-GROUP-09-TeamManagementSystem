// algorithm for sentence generation
let sentences = [];
function generate() {
    var data = {
    	"start": ["#NP# #VP#."],
    	"NP": ["#Adj# #N#", "#Det# #Adj# #N# #Adv", "#N#", "#Adj# #N# #Det# #N#", "#N# #Det# #N#"],
    	"VP": ["#V# #NP#"],
    	"Det": ["on", "for", "in"],
    	"N": ["watermelon", "summer", "bananas", "energy", "workouts", "vitamin-c", "oranges", "immune-system"],
    	"V": ["refreshes", "provide", "boosts"],
        "Adj": ["juicy", "hot", "natural"],
        "Adv": ["days"]
    }
    
    let grammar = tracery.createGrammar(data);
    let expansion = grammar.flatten('#start#');

    sentences.push(expansion);

    printSentences(sentences);
}

function printSentences(sentences) {
    let textBox = document.getElementById("sentences");
    textBox.innerHTML = "";
    for(let i=sentences.length-1; i>=0; i--) {
        textBox.innerHTML += "<p>"+sentences[i]+"</p>"
    }
}
