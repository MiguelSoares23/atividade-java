import java.util.ArrayList;
import model.*;

public class Main {
    public static void main(String[] args) {
        // Criando listas de documentos vazias
        ArrayList<Documento> docs = new ArrayList<>();

        // Instanciando 3 obejtos de EmendaComissao
        EmendaComissao comissao1 = new EmendaComissao(
            2025, "Comissão", "Deputado A", 101, true,
            "Pernambuco", "Saúde", "Hospitais", "Programa Saúde+", 
            "Construção UPA", "Plano A", "COD101",
            500000, 400000, 300000, 
            200000, 50000, 100000,
            docs, "www.comissao1.gov", new ArrayList<>(), "www.relatorio1.gov", "Deputado A"
        );

        EmendaComissao comissao2 = new EmendaComissao(
            2025, "Comissão", "Deputado B", 102, false,
            "São Paulo", "Educação", "Escolas", "Programa Educa+", 
            "Construção Escola", "Plano B", "COD102",
            700000, 650000, 500000, 
            200000, 100000, 50000,
            docs, "www.comissao2.gov", new ArrayList<>(), "www.relatorio2.gov", "Deputado B"
        );

        EmendaComissao comissao3 = new EmendaComissao(
            2025, "Comissão", "Deputado C", 103, true,
            "Minas Gerais", "Infraestrutura", "Estradas", "Programa Estradas+", 
            "Duplicação BR-101", "Plano C", "COD103",
            900000, 800000, 700000, 
            300000, 200000, 100000,
            docs, "www.comissao3.gov", new ArrayList<>(), "www.relatorio3.gov", "Deputado C"
        );

        // Instanciando 3 obejtos de EmendaIndividual
        EmendaIndividual individual1 = new EmendaIndividual(
            2025, "Individual", "Deputado D", 201, false,
            "Bahia", "Cultura", "Museus", "Programa Cultura+", 
            "Reforma Museu", "Plano D", "COD201",
            300000, 250000, 200000, 
            100000, 20000, 50000,
            docs, "Transferência Especial", true
        );

        EmendaIndividual individual2 = new EmendaIndividual(
            2025, "Individual", "Deputado E", 202, true,
            "Rio de Janeiro", "Esporte", "Estádios", "Programa Esporte+", 
            "Construção Quadra", "Plano E", "COD202",
            150000, 140000, 100000, 
            60000, 10000, 20000,
            docs, "Transferência Direta", false
        );

        EmendaIndividual individual3 = new EmendaIndividual(
            2025, "Individual", "Deputado F", 203, false,
            "Paraná", "Agricultura", "Agro", "Programa Agro+", 
            "Compra Equipamentos", "Plano F", "COD203",
            400000, 350000, 300000, 
            150000, 20000, 50000,
            docs, "Transferência Especial", true
        );

        // Instanciando 3 obejtos de EmendaRelator
        EmendaRelator relator1 = new EmendaRelator(
            2025, "Relator", "Deputado G", 301, true,
            "Distrito Federal", "Defesa", "Segurança", "Programa Defesa+", 
            "Compra Viaturas", "Plano G", "COD301",
            800000, 700000, 600000, 
            250000, 50000, 100000,
            docs, "Deputado Relator G", "Deputado G", "Polícia Militar"
        );

        EmendaRelator relator2 = new EmendaRelator(
            2025, "Relator", "Deputado H", 302, false,
            "Amazonas", "Meio Ambiente", "Florestas", "Programa Verde+", 
            "Preservação Florestal", "Plano H", "COD302",
            600000, 550000, 500000, 
            150000, 20000, 30000,
            docs, "Deputado Relator H", "Deputado H", "ONG Ambiental"
        );

        EmendaRelator relator3 = new EmendaRelator(
            2025, "Relator", "Deputado I", 303, true,
            "Ceará", "Turismo", "Praias", "Programa Turismo+", 
            "Reforma Orla", "Plano I", "COD303",
            900000, 850000, 750000, 
            300000, 50000, 100000,
            docs, "Deputado Relator I", "Deputado I", "Prefeitura Fortaleza"
        );

        // Instanciando 3 obejtos de EmentaBancada
        EmentaBancada bancada1 = new EmentaBancada(
            2025, "Bancada", "Deputado J", 401, true,
            "Piauí", "Saúde", "Hospitais", "Programa Saúde+", 
            "Construção Hospital", "Plano J", "COD401",
            1000000, 900000, 800000, 
            400000, 100000, 200000,
            docs, new ArrayList<>(), new ArrayList<>(), "www.ata1.gov", "Deputado J"
        );

        EmentaBancada bancada2 = new EmentaBancada(
            2025, "Bancada", "Deputado K", 402, false,
            "Alagoas", "Educação", "Escolas", "Programa Educa+", 
            "Reforma Escola", "Plano K", "COD402",
            500000, 450000, 400000, 
            200000, 50000, 50000,
            docs, new ArrayList<>(), new ArrayList<>(), "www.ata2.gov", "Deputado K"
        );

        EmentaBancada bancada3 = new EmentaBancada(
            2025, "Bancada", "Deputado L", 403, true,
            "Mato Grosso", "Infraestrutura", "Rodovias", "Programa Estradas+", 
            "Pavimentação MT-130", "Plano L", "COD403",
            1200000, 1100000, 1000000, 
            500000, 200000, 300000,
            docs, new ArrayList<>(), new ArrayList<>(), "www.ata3.gov", "Deputado L"
        );


        // Testando saída de um exemplo
        comissao1.exibirResumo();
        individual1.exibirResumo();
        relator1.exibirResumo();
        bancada1.exibirResumo();
    }
}
