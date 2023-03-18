package Desafio2;

import java.util.*;

public class Menu {
    static ArrayList<Usuario> usuarios = new ArrayList<>();
    static ArrayList<BilheteUnico> bilhetes = new ArrayList<>();
    static BilheteUnico bilhete;
    static Scanner input = new Scanner(System.in);
    static int posicao;

    public Menu() {

        System.out.println("--- OPÇÕES DE MENU ---");

        System.out.println("1- Cadastrar Usuário ");
        System.out.println("2- Cadastrar Bilhete ");
        System.out.println("3- Recarregar Bilhete ");
        System.out.println("4- Pagar Passagem ");
        System.out.println("5- Listar Bilhetes ");
        System.out.println("6- Pesquisar Bilhete por CPF ");
        System.out.println("99- sair ");
        System.out.println();

    }
    public static void CadastrarBilhete() {

        Usuario usuario = null;
        String cpf;

        boolean achou = false;

        System.out.println("Insira um CPF: ");
        cpf = input.nextLine();

        for (Usuario value : usuarios) {
            if (cpf.equals(value.getCpf())) {
                usuario = value;

                achou = true;
            }
        }

        if (!achou) {

            System.out.println("Inválido! Tente novamente.");

        } else {

            System.out.println("-- CADASTRO DE BILHETE --");

                System.out.println("Bilhete de estudante ou comum? Digite 1 para 'Estudante' e 2 para 'Comum'");
                int escolha = input.nextInt();

                BilheteUnico bilhete;

                if (escolha == 1) {

                    bilhete = new BilheteEstudante(usuario);

                } else {

                    bilhete = new BilheteComum(usuario);

                } bilhetes.add(bilhete);
            }
        }
    public static void Listar() {

        System.out.println("-- LISTA DE BILHETES --");

        for (BilheteUnico bilheteUnico : bilhetes) {
            String dados = "Bilhetes:" + "\n" + bilheteUnico;

            System.out.println(dados);
        }
    }
    public static void recarregarBilhete() {

        input.nextLine();

        boolean achou1 = false;

        System.out.println("Insira seu código: ");
        String codigo = input.nextLine();

        for (BilheteUnico value : bilhetes){
            if (codigo.equals(value.getCodigo())) {

                bilhete = value;

                achou1 = true;

            } if (!achou1) {

                System.out.println("Código inválido! Tente novamente.");

            } else {
                if (bilhete instanceof BilheteEstudante) {

                    ((BilheteEstudante) bilhete).recarregarBilhete();

                } else {

                    System.out.println("Valor da recarga: ");
                    double valor = input.nextDouble();

                    bilhete.recarregarBilhete(valor);

                }
            }
        }
    }
    public static void pagarPassagem() {

        input.nextLine();

        boolean achou2 = false;

        System.out.println("Insira o código: ");
        String codigo = input.nextLine();

        for (BilheteUnico value : bilhetes) {
            if (codigo.equals(value.getCodigo())) {

                bilhete = value;

                achou2 = true;

            } if (!achou2) {

                System.out.println("Código inválido! Insira novamente.");

            } else {
                if (bilhete instanceof BilheteEstudante) {

                    bilhete.pagarPassagem();

                } else {

                    bilhete.pagarPassagem();

                }
            }
        }
    }
    public static void pesquisarCpf() {

        input.nextLine();

        boolean achou3 = false;
        String cpf;

        System.out.println("Insira seu CPF: ");
        cpf = input.nextLine();

        for (BilheteUnico value : bilhetes) {
            if (cpf.equals(value.usuario.getCpf())) {

                bilhete = value;

                achou3 = true;
            } if (!achou3) {

                System.out.println("Cpf inválido! Tente novamente.");

            } else {
                if (bilhete instanceof BilheteEstudante) {

                    ((BilheteEstudante) bilhete).pesquisarPeloCpf();
                    System.out.println(bilhete);

                } else {

                    bilhete.pesquisarPeloCpf();
                    System.out.println(bilhete);

                }
            }
        }
    }
    public static void main(String[] args) {

        String nome, cpf, email, telefone;
        int opcao;
        try {

            do {

                new Menu();

                opcao = input.nextInt();

                switch (opcao) {

                    case 1:

                        input.nextLine();

                        System.out.println("Informe nome:");
                        nome = input.nextLine();

                        System.out.println("Informe email:");
                        email = input.nextLine();

                        System.out.println("Informe telefone:");
                        telefone = input.nextLine();

                        System.out.println("Informe CPF:");
                        cpf = input.nextLine();

                        usuarios.add(new Usuario(nome, telefone, cpf, email));
                        posicao++;

                        break;

                    case 2:

                        input.nextLine();

                        CadastrarBilhete();

                        System.out.println("Bilhete cadastrado!");

                        break;

                    case 3:

                        recarregarBilhete();

                        break;

                    case 4:

                        pagarPassagem();

                        break;

                    case 5:

                        Listar();

                        break;

                    case 6:

                        pesquisarCpf();

                        break;

                    case 99:

                        System.out.println("Programa Finalizado!");

                        break;

                    default:

                        System.out.println("Opção Inválida! Tente novamente.");

                }
            } while (opcao != 99);
        } catch (InputMismatchException e) {

            System.out.println("erro! Insira um número.");

        }

         input.close();

    }
}
