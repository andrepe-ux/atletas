// Base de dados simulada de utilizadores e permissões (Gerido via JS / JSON)
const utilizadoresPermissoes = [
    {
        utilizador: "JoaoOliveira",
        palavraPasse: "Treinador1",
        nomeCompleto: "João Oliveira",
        role: "coordenador", // Acede a todos os escalões e gestão total
        escaloesPermitidos: ["todos"] 
    },
    {
        utilizador: "AndrePereira",
        palavraPasse: "Amanu1",
        nomeCompleto: "André Pereira",
        role: "Gestor Aplicação", // Acede apenas ao escalão definido
        escaloesPermitidos: ["todos"] 
    },
    {
        utilizador: "TreinadorBenjamins",
        palavraPasse: "Benjamins123",
        nomeCompleto: "Carlos Silva",
        role: "treinador",
        escaloesPermitidos: ["Benjamins"] 
    }
];

// Variável global para guardar a sessão do utilizador atualmente autenticado
let utilizadorLogado = null;