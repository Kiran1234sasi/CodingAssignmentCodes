document.getElementById("surveyForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent form submission

    // Validate form fields
    const firstName = document.getElementById("firstName").value.trim();
    const lastName = document.getElementById("lastName").value.trim();
   